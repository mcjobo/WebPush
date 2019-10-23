<template>
  <div>
    <v-timeline dense>
              
      <chat-entry v-for="mes in messages"
                  v-bind:key="mes.id"
                  v-bind:message="mes.message"
                  v-bind:user="mes.user"/>
      
      
    </v-timeline>
  
    <v-form>
      <v-container>
        <v-row>
          <v-text-field label="Solo" placeholder="Nachricht" solo/>
          <v-btn color="primary">senden</v-btn>
        </v-row>
      </v-container>
    </v-form>
  </div>
</template>

<script>
import chatEntry from '../components/chatEntry.vue';

export default {
  name: "chatBase",
  components: {
    chatEntry
  },
  data: function(){
    return {
      messages:[
        {id: 1, user: 'Claudia Kröger', message:'Hallo das ist eine tolle chat message von vue'},
        {id: 2, user: 'Anja Bolay', message:'Wir wollen am nächsten Stammtreff ein Spiel machen'},
        {id: 3, user: 'Andreas Kröger', message:'Ich habe die Gitte dabei'},
      ]
    };
  }
}
</script>