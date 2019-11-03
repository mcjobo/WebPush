<template>
    <v-app-bar app color="secondary" prominent src="../assets/tree.jpg">
        <v-app-bar-nav-icon class="hidden-md-and-up" />
        <v-container class="mx-auto">
            <v-layout>
            <v-img :src="require('@/assets/logo.png')" class="mr-5" contain height="48" width="48" max-width="48" @click="$vuetify.goTo(0)"/>
        <v-btn v-for="(link, i) in links" :key="i" :to="link.to" color='secondary' text-color="primary" class="ml-0 hidden-sm-and-down"  @click="onClick($event, item)">
          {{ link.text }}
        </v-btn>
            </v-layout>
        </v-container>
    </v-app-bar>
</template>

<script>
export default {
    name: 'baseToolbar',
    data: function(){
        return {
            links: [
                {i: 1, text: 'HOME'},
                {i: 2, text: 'Wo?'},
                {i: 3, text: 'Termine'},
                {i: 4, text: 'Aktuelles'},
                {i: 5, text: 'Kontakt'}
            ]
        };
    }

}
</script>

<style>

</style>