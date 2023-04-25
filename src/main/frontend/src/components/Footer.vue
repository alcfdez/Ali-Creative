<script>
</script>

<template>
    <footer>
        
        <!-- <img class="logo" src="../assets/img/aliCreative-logo.png" alt="logo Ali Creative"> -->
        <div class="contact" >
<div class="contactDetail" >
    
    <i class="fa-brands fa-instagram" style="color: #000000;"></i>
    <a target="_blank" :href=" 'https://www.instagram.com/alinspirecreative/ '" > </a>
    <p>alinspirecreative</p>
</div>

<div class="contactDetail">
    <i class="fa-regular fa-envelope" style="color: #000000;"></i>
<p>alicreative@gmail.com</p>
</div>
</div>


</footer>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

footer{
height: 7em;
width: 100%;
background-color: $bone;



    // .logo{
    //     display: flex;
    //     justify-items: flex-start;
    //     width: 20%;
    //     height: 20%;
    // }

    .contact{
        display: flex;
        flex-direction: column;
       width: 30%;
       margin-left: 70%;
       justify-content: center;
       padding-top: 3em;
       

       
       .contactDetail{
            font-family: $font-section;
            font-size: 1em;
            font-weight: 600;
            color: black;
            display: flex;
            flex-direction: row;
            gap:3px;
        }

        }

  

}


</style>