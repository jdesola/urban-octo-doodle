<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
    <p>{{ $store.state.user }}</p> 
    <p>{{ $store.state.token }}</p>
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>
