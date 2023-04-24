<script>

</script>

<template>
    <div class="card">
        <img src="../assets/img/57486F40-C358-4B46-A4E9-30D411F4CF4C.jpg" alt="">
            <p>25 €</p>
            <p>Paisaje</p>
            <button>
        <i class="fa-solid fa-plus" style="color: #3a1464;"></i>
    </button>
    </div>

    <div class="card">
        <img src="../assets/img/Cisne.jpg" alt="pavo real">
            <p>40 €</p>
            <p>Pavo Real</p>
            <button>
        <i class="fa-solid fa-plus" style="color: #3a1464;"></i>
    </button>
    </div>

    <div class="card">
        <img src="../assets/img/Flores-magenta.jpg" alt="flores magenta">
            <p>15 €</p>
            <p>Flores Magenta</p>
            <button>
        <i class="fa-solid fa-plus" style="color: #3a1464;"></i>
    </button>
    </div>

    <div class="card">
        <img src="../assets/img/Paisaje-Atardecer.jpg" alt="Atardecer">
            <p>20 €</p>
            <p>Atardecer</p>
            <button>
        <i class="fa-solid fa-plus" style="color: #3a1464;"></i>
    </button>
    </div>
</template>

<style lang="scss" scoped>
@import "../scss/main.scss";

.card{
    width: 15em;
    height: 20em;
    border-radius: 5%;
    background-color: $lila-2;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;

    img{
        width: 10em;
        height: 12em;
    }

    p{
        margin-top: 2%;
        font-family: $font-text;
        color: $purple;
        font-size: large;

    }

    button {
        margin-top: 2%;
        display: flex;
        justify-content: flex-end;
        font-weight: bolder;
        font-size: large;
    }

}

</style>