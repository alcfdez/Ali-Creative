<script setup>
import axios from 'axios';
import { defineProps, ref, onBeforeMount, reactive} from 'vue';
import PictureService from "../services/PictureService"



// onBeforeMount(() => {
//   axios({
//     method: "GET",
//     url: "http://localhost:8080/api/pictures/{id}" ,
//     withCredentials: false,
//   })
//     .then((response) => {
//       picture.value = response.data;
//     })
//     .catch((e) => {
//       console.log("error");
//     });
// });

const service = new PictureService();
const pictures = reactive([]);

onBeforeMount(async () => {
  await service.fetchAllPicture();
  pictures.value = service.getPictures();
  console.log(service.getPictures());
  console.log(pictures.value);
});



const props = defineProps({
	picture: Object,
})

window.addEventListener("DOMContentLoaded", () => {
	const buttonDelete = document.querySelector(".button-delete");
	const buttonEdit = document.querySelector(".button-edit");
	const title = document.querySelector(".title");
	const  type = document.querySelector(".type");
	const  price = document.querySelector(".price");
	const  size = document.querySelector(".size");
	const  technique = document.querySelector(".technique");
	const  description = document.querySelector(".description");
    const  file = document.querySelector(".file");
    





	buttonDelete.addEventListener("click", () => {
		const picture = buttonDelete.closest(".row");
		picture.remove();
	});

	buttonEdit.addEventListener("click", () => {
		title.contentEditable = true;
		type.contentEditable = true;
        price.contentEditable = true;
        size.contentEditable = true;
        technique.contentEditable = true;
        description.contentEditable = true;
		file.contentEditable = true;
		buttonEdit.style.display = "none";
		const buttonSave = document.createElement("button");
		buttonSave.textContent = "Guardar";
		buttonSave.classList.add("button-save");
		buttonEdit.parentNode.insertBefore(
			buttonSave,
			buttonEdit.nextSibling
		);
		buttonSave.addEventListener("click", () => {
			title.contentEditable = false;
		type.contentEditable = false;
        price.contentEditable = false;
        size.contentEditable = false;
        technique.contentEditable = false;
        description.contentEditable = false;
		file.contentEditable = false;
			buttonSave.parentNode.removeChild(buttonSave);
			buttonEdit.style.display = "block";
		});
	});
});



const deletePicture = () => {
	const idPicture = props.picture.id;
	axios({
		method: "DELETE",
		url: "http://localhost:8080/api/picture/" + idPicture,
		withCredentials: false,
	});
	location.reload()
};

const dialog = ref(false);

</script>

<template>
<table>
    <thead>
      <tr>
        <th>Título</th>
        <th>Tipo</th>
        <th>Precio</th>
        <th>Tamaño</th>
        <th>Técnica</th>
        <th>Descripción</th>
        <th>Imagen</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="picture in pictures" :key="picture">
        <td>{{ data.titulo }}</td>
        <td>{{ data.tipo }}</td>
        <td>{{ data.precio }}</td>
        <td>{{ data.tamaño }}</td>
        <td>{{ data.tecnica }}</td>
        <td>{{ data.descripcion }}</td>
        <td><img :src="dato.imagen" alt=""></td>
      </tr>
    </tbody>
  </table>
    
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

table {
  border-collapse: collapse;
  width: 100%;
  margin-bottom: 1rem;
  
  th,
  td {
    border: 1px solid #ddd;
    padding: 0.5rem;
    text-align: left;
  }

  th {
    background-color: $lila;
    font-family: $font-section;
    color: $purple;
  }

  tbody tr:nth-child(even) {
    background-color: #f2f2f2;
    font-family: $font-text;
  }

  tbody td {
    vertical-align: middle;
  }

  tbody td:first-child,
  tbody td:last-child {
    white-space: nowrap;
  }

  tbody td:nth-child(6) {
    text-align: center;
  }

  img {
    display: block;
    width: 100%;
    height: auto;
    max-width: 100px;
  }
}



</style>