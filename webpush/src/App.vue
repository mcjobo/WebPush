<template>
  <v-app>
    <baseToolbar/>
    

    <v-content>
      <chatBase/>
      <textLoremIpsum/>
    </v-content>
  </v-app>
</template>

<script>
import chatBase from './components/chatBase';
import baseToolbar from './components/baseToolbar';
import textLoremIpsum from './components/textLoremIpsum';

export default {
  name: 'App',
  components: {
    chatBase,
    baseToolbar,
    textLoremIpsum,
  },
  data: () => ({
    //
  }),
};
</script>
