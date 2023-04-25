<script></script>

<template>
  <header>
    <div class="menu">
      <input type="checkbox" id="menu" />
      <label for="menu">
        <i class="fa-solid fa-bars" style="color: #3a1464"></i>
      </label>
      <ul>
        <router-link to="/" class="nav-bar__link" href="">Home</router-link>
        <router-link to="/initials" class="nav-bar__link" href=""
          >Iniciales</router-link
        >
        <router-link to="/names" class="navLink" href="">Nombres</router-link>
        <router-link to="/infantile" class="navLink" href=""
          >Infantiles</router-link
        >
        <router-link to="/botanic" class="navLink" href=""
          >Botánica</router-link
        >
        <router-link to="/stationery" class="navLink" href=""
          >Papelería</router-link
        >
        <router-link to="/mix" class="navLink" href="">Mix</router-link>
        <router-link to="/form" class="navLink" href=""
          >Añadir Producto</router-link
        >
        <router-link to="/List" class="navLink" href=""
          >Lista Productos</router-link
        >
      </ul>
    </div>
    <div class="nameBrand">
      <h2>Ali Creative</h2>
      <h4>ILUSTRADORA - MI ESPACIO CREATIVO</h4>
    </div>
  </header>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

header {
  width: 100%;
  position: sticky;
  z-index: 10;
  left: 0%;
  top: 0%;
  right: 0%;
  bottom: 0%;
  display: flex;
  height: 8rem;
  background-color: $lila;
  margin-bottom: 1px;

  @media (max-width: 400px) {
    height: 5rem;
      }
  .menu {
   
    position: absolute;
    padding-top: 2.5%;
   
    ul {
      display: none;
    }

    input:checked ~ ul {
      display: block;
    }

    input {
      display: none;
    }

    label {
      padding-bottom: 8%;

      background: $lila;
      width: 60px;
      height: 60px;

      font-weight: bold;
      font-size: 3vw;
      color: $purple;
      text-align: center;
      user-select: none;
    }

    /* Estilo del boton cuando se pasa el mouse por encima*/
    label:hover {
      background: $lila-2;
    }

    /* Estilo del boton cuando el menú está expandido*/
    input:checked ~ label {
      background: $lila;
    }

    ul {
      background-color: $lila;
      margin-top: 0;
      padding: 5%;
      width: 270px;
      height: 100vw;
      font-family: $font-text;
      font-size: 2em;
      color: $purple;
    }

    li {
      display: block;
      background: $lila;
      margin: 0;
      padding: 10px;
      list-style: none;
      border-bottom: 1px solid $lila-2;
    }

    /*Estilo cuando el mouse pasa encima de cada link del menu*/
    li:hover {
      filter: brightness(110%);
    }
  }

  .nameBrand {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;

    h2 {
      margin-top: 0.1em;
      margin-bottom: -2%;
      font-size: 5em;
      font-family: $font-brand;
      color: $purple;
      font-weight: 500;

      @media (max-width: 650px) {
        font-size: 3em;
      }
    }

    h4 {
      margin-bottom: 0.2em;
      font-family: $font-brand2;
      color: $purple;
      font-size: 1.5em;
      font-weight: bold;

      @media (max-width: 650px) {
        font-size: 1em;
        align-items: center;
      }

      @media (max-width: 550px) {
        font-size: .5em;
        align-items: center;
      }
    }
  }
}
</style>
