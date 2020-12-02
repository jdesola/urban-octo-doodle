<template>
 <div>
     <h1>Watcher Example</h1>
     <input type="text" v-model="question" />
     <div>Old Value: {{ oldValue }}</div>
     <div>New Value: {{ newValue }}</div>
 </div>
</template>
 
<script>
export default {
   name: 'watcher',
   data() {
       return {
           question: '',
           oldValue: '',
           newValue: ''
       }
   },
   watch: {
       question: function (updatedValue, originalValue) {
           this.oldValue = originalValue;
           this.newValue = updatedValue;
       }
   }

}
</script>

<style>

</style>