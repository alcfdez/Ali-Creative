import { ref } from "vue";
import axios from "axios";

export default class PictureService {
  picture;
  #url = "http://localhost:8080/api/pictures";

  constructor() {
    this.picture = ref([]);
  }

  getPicture() {
    return this.picture.value;
  }

  async fetchAllPicture() {
    
    try {
        axios({
            method: "GET",
            url: this.#url,
           
        }).then((response) =>{
            this.picture.value=response.data
            console.log(response.data)
        });
      
    } catch (err) {
        console.log(err);
    }
  }

  async deletePicture(props, rows) {
    try {
      axios
        .delete("/" + props.id)
        .then((res) => {
          const index = rows.value.findIndex((row) => row.id === props.id);
          rows.value.splice(index, 1);
        });
    } catch (err) {
      console.log(err);
    }
  }

  async updatePicture(pictureId){
   await axios.put(`${this.#url}pictures/${pictureId}`)
     .then((res) => {
  });
  }
}


