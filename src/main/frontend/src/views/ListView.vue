<script setup>
import Header from "../components/Header.vue"

</script>

<template>
  <main>
    <Header />
    <div class="title">
    <h1>LISTA DE PRODUCTOS</h1>
    <img src="../assets/img/manchaMint.png" alt="">
     </div>

     <section>
        
     </section>
  </main>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

.title{ 
  position: sticky;
  z-index: 9;
  margin-left: 8%;
  margin-top: 2%;
  display: flex;
  align-items: center;
  justify-content: center;
  
  h1{
    margin-left: 10%;
    font-family: $font-section;
    font-size: 3em;
    color: $purple;
    z-index: 1;
  }
  img{
    width: 15%;
    position: relative;
    right: 8%;
  }
}
  section{
    margin: 1% 15%;
    display: flex;
    flex-direction: row;
  }
</style>