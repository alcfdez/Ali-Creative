<script setup>
import {ref, reactive} from 'vue';
import axios from 'axios';
import FormService from '../services/FormService';


const onfileChange = event => {
  file.value = event.target.files[0];
};
const file= ref(null);
const formService = new FormService()
const titleModel = ref()
const priceModel = ref()
const sizeModel = ref()
const techniqueModel = ref ()
const descriptionModel = ref()
const typeModel = ref()
const fileModel =ref()
const form = reactive({
  title: titleModel,
  price: priceModel,
  size: sizeModel,
  technique: techniqueModel,
  description: descriptionModel,
  type:typeModel,
  file: fileModel
})

const submitData = async () => {
  try {
    const formData = new FormData();
    formData.append("title", titleModel.value);
    formData.append("price", priceModel.value);
    formData.append("size", sizeModel.value);
    formData.append("techique", techniqueModel.value);
    formData.append("type", typeModel.value);
    formData.append("description", descriptionModel.value);
    formData.append("file", fileModel.value);
    if (file.value != null) {
      formData.append("file", file.value);


    await axios({
      method: "POST",
      url: "http://localhost:8080/media/upload/picture",
      data: formData,
      withCredentials: false,
      headers: {
          "Content-Type": "multipart/form-data",
        },
    });
  } else {
      await axios({
        method: "POST",
        url: "http://localhost:8080/api/picture/add",
        data: post,
        withCredentials: true,
      });
    }
    console.log("Enviado");
  }catch(error){
      console.log(error);
    }
}



</script>

<template>
  <div class="form">
    <form action="/api/pictures" method="post" @submit.prevent>
      <div class="form-row">
        <label>Título</label>
        <input v-model="titleModel" type="text" />
      </div>

      <div class="form-row">
        <label>Precio</label>
        <input v-model="priceModel" type="text" />
      </div>

      <div class="form-row">
        <label>Tipo</label>
        <select v-model="typeModel" name="tipo" id="">
          <option value="type">iniciales - nombres</option>
          <option value="type">nombres</option>
          <option value="type">infantil</option>
          <option value="type">botánica</option>
          <option value="type">papelería</option>
          <option value="type">mix</option>
        </select>
      </div>


      <div class="form-row">
        <label>Tamaño</label>
        <select v-model="sizeModel" name="tamaño" id="">
          <option value="size">A3 - 42 x 29,7 cm</option>
          <option value="size">A4 - 29,7×21 cm</option>
          <option value="size">A5 - 21 x 14,8 cm</option>
          <option value="size">A6 - 14,8 x 10,5 cm</option>
          <option value="size">otros</option>
        </select>
      </div>

      <div class="form-row">
        <label>Técnica</label>
        <select v-model="techniqueModel" name="Tecnica" id="">
          <option value="technique">Acuarela</option>
          <option value="technique">Carboncillo-Grafito</option>
          <option value="technique">Pastel</option>
          <option value="technique">Acrílico</option>
          <option value="technique">Mixta</option>
        </select>
      </div>

      <div class="form-row">
        <label>Imagen</label>
        <input  type="file" placeholder="Subir imagen" @change="onfileChange" v-bind:ref="file" />
      </div>

      <label class="description">Descripción</label>
      <textarea
       v-model="descriptionModel"
        type="text"
        placeholder="Descripción de la obra ..."
      />
    </form>

    <div class="buttonsContainer">
      <!-- <button @click="cancel" class="button">Cancelar</button> -->
      <button @click="submitData" class="button">Aceptar</button>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

.form {
  background-color: $lila-2;
  border-radius: 10px;
  margin-left: 10%;
  margin-right: 10%;
  padding: 4% 15%;

  .form-row {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 10px;

    label {
      width: 15%;
      margin-right: 8px;
      font-family: $font-section;
      color: $purple;
      font-size: larger;
      font-weight: 600;
    }

    input {
      flex: 1;
      padding: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
      background-color: $bone;
    }

    select {
      flex: 1;
      padding: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
      background-color: $bone;
    }
  }

  .description {
      font-family: $font-section;
      color: $purple;
      font-size: larger;
      font-weight: 600;
      
    }
    textarea[type="text"][placeholder="Descripción de la obra ..."] {
       background:$bone;
      font-family: $font-text;
      width: 100%;
      padding: 1%;
      border: 1px solid #ccc;
      border-radius: 4px;
      height: 6vw;
      text-align: justify;
    }

  .buttonsContainer{
        display: flex;
        flex-direction: row;
        justify-content: space-evenly;
        margin-top: 3%;


        .button{
            padding: 1.5%;
            background-color: $purple;
            font-family: $font-section;
            color:$bone;
            border-radius: 5px;
        }
        

  }
}
</style>
