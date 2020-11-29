<template>
  <div id="app">
      <h1>Vue Vending Machine</h1>
      <div class="item-lists">
        <item-list class="item-list" itemType="B" title="Beverages" />
        <item-list class="item-list" itemType="E" title="Entrees" />
        <item-list class="item-list" itemType="D" title="Desserts" />
        <item-list class="item-list" itemType="A" title="Appetizers" />
      </div>
  </div>
</template>

<script>
import ItemList from '../components/ItemList.vue';

export default {
    name: "vending-machine",
    components: { 
      ItemList 
    },
    created() {
        this.$store.dispatch("getProducts");
    }
}
</script>

<style>
div#app div.item-lists{
   display: flex;
   justify-content: space-between;
   flex-wrap: wrap;
}
div#app .item-list {
   border: 1px black solid;
   padding-left: 2vw;
   padding-right: 2vw;
   margin: 10px;
   min-width: 200px;
 
}
body {
   background-image: linear-gradient(rgb(238, 128, 128), rgb(243, 243, 166));
   background-repeat: no-repeat;
   background-color: rgb(243, 243, 166);
}
 
</style>
