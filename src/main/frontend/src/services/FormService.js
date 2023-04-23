import axios from "axios";
import { ref } from "vue";

export default class FormService{
    form;
    #url = "http://localhost:8080/api/pictures"

    constructor(){
        this.form = ref([]);
    }

    getForm(){
        return this.form.value
    }

    async submitForm(formData){
        try{
            axios({
                method: "POST",
                url: this.#url + "/add",
                data: formData,

            }).then(response => {
                console.log(response);
            });
        }catch (error){
            console.log(error);
        }

    }

    async fetchAllForm(){
        try {
            await axios({
                method: "GET",
                url: this.#url,
            }).then(response =>{
                this.form.value=response.data
                console.log(response.data);
            });
        } catch (error){
            console.log(error);
        }
    }
}