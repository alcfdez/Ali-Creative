<script setup>
import Header from "../components/Header.vue"
import Card from "../components/Card.vue"
import Footer from "../components/Footer.vue"
</script>

<template>
  <Header />
  <main>
    <div class="title">
    <h1>DESTACADOS</h1>
    <img src="../assets/img/manchaMint.png" alt="mancha pincel mint">
     </div>

     <section class="cards">
        <Card/>
     </section>

     <div class="title">
     <h1>GALERIA</h1>
     <img src="../assets/img/manchaMint.png" alt="mancha pincel mint">
   </div>

     <section class="galery">
     

      <img class="example" src="../assets/img/streemLaminas.jpg" alt="foto con láminas">
      <img class="example" src="../assets/img/mercadillo.png" alt="mercadillo">
      <img class="example" src="../assets/img/infantiles.jpg" alt="infantiles">
      <img class="example" src="../assets/img/regaloPadrino.jpg" alt="regalo para padrino">




    </section>

  </main>
  <!-- <Footer/> -->

</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

.title{ 
  position: sticky;
  z-index: 9;
  margin-left: 8%;
  margin-top: 2%;
  margin-bottom: 2%;
  display: flex;
  align-items: center;
  justify-content: center;
  
  h1{
    margin-left: 10%;
    font-family: $font-section;
    font-size: 3em;
    color: $purple;
    z-index: 1;

    @media (max-width: 650px) {
       font-size: 2em;
      }
  }
  img{
    width: 15%;
    position: relative;
    right: 8%;
  }
}
  .cards{
    margin: 1% 15%;
    margin-bottom: 5%;
    display: flex;
    flex-direction: row;
    justify-content: space-around;

    @media (max-width: 600px) {
        flex-direction: column;
        margin-bottom: 10%;
      }
    
  }
  .galery{
    display: flex;
    flex-direction: column;
    width: 50%;
  height: 20%;
  margin: 0 20%;

  .example{
    margin-bottom: 5% ;
    margin-left: 13%;
  }
  }

  

  
</style>