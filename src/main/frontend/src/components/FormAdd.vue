<script></script>

<template>
  <div class="form">
    <form action="/api/pictures" method="post">
      <div class="form-row">
        <label>Título</label>
        <input type="text" />
      </div>

      <div class="form-row">
        <label>Precio</label>
        <input type="text" />
      </div>

      <div class="form-row">
        <label>Tamaño</label>
        <select name="tamaño" id="">
          <option value="size">A3 - 42 x 29,7 cm</option>
          <option value="size">A4 - 29,7×21 cm</option>
          <option value="size">A5 - 21 x 14,8 cm</option>
          <option value="size">A6 - 14,8 x 10,5 cm</option>
          <option value="size">otros</option>
        </select>
      </div>

      <div class="form-row">
        <label>Técnica</label>
        <select name="Tecnica" id="">
          <option value="technique">Acuarela</option>
          <option value="technique">Carboncillo-Grafito</option>
          <option value="technique">Pastel</option>
          <option value="technique">Acrílico</option>
          <option value="technique">Mixta</option>
        </select>
      </div>

      <div class="form-row">
        <label>Imagen</label>
        <input type="text" placeholder="Subir imagen" />
      </div>

      <label class="description">Descripción</label>
      <textarea
        type="text"
        placeholder="Descripción de la obra ..."
      />
    </form>

    <div class="buttonsContainer">
      <button @click="reload" class="button">Cancelar</button>
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
