<script>
</script>

<template>
    <footer>
        
        <img class="logo" src="../assets/img/aliCreative-logo.png" alt="logo Ali Creative">
        <section class="contact">
<div class="contactDetail" >
    <p>alinspirecreative</p>
    <i class="fa-brands fa-instagram" style="color: #000000;"></i>
</div>

<div class="contactDetail" >
    <p>alinspirecreative</p>
    <i class="fa-regular fa-envelope" style="color: #000000;"></i>
</div>

</section>

</footer>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

footer{
height: 7em;
width: 100%;
background-color: $bone;
display: flex;
flex-direction:row ;

    .logo{
        display: flex;
        justify-items: flex-start;
        width: 20%;
        height: 20%;
    }

    .contac{
        display: flex;
        flex-direction: column;
        justify-content: flex-end;

        .contactDetail{
            display: flex;
            flex-direction: row;
            font-family: $font-section;

        }

    }

}


</style>