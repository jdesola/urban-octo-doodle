<template>
  <table>
      <thead>
          <tr>
              <th>ID</th>
              <th>Name</th>
              <th># Reviews</th>
          </tr>
      </thead>
      <tbody>
          <tr v-for="product in $store.state.products"
<<<<<<< HEAD
          v-bind:key="product.id">
          <td>{{ product.id }}</td>
          <td><router-link :to="{
              name: 'product-detail',
              params: {
                  id: product.id
                  }}">{{ product.name }}</router-link></td>
          <td>{{ product.reviews.length }}</td>
=======
            v-bind:key="product.id">
              <td>{{ product.id }}</td>
              <td><router-link :to="{ 
                        name: 'product-detail',
                        params: {
                            id: product.id
                        }}">
                    {{ product.name }}</router-link></td>
              <td>{{ product.reviews.length }}</td>
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
          </tr>
      </tbody>
  </table>
</template>

<script>
export default {
<<<<<<< HEAD
  name: "products-list"
}
</script>

<style style="scoped">
=======
    name: "products-list"
}
</script>

<style>
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
    th,td {
        text-align: left;
    }
    td {
        padding-right: 10px;
        vertical-align: top;
    }
<<<<<<< HEAD
=======
    tr:nth-child(even) {
        background-color: rgb(238, 238, 238);
    }
>>>>>>> 79e5bd1310487068371d66b41bd53bafd42d07e4
</style>