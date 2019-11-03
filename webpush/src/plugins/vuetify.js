import Vue from 'vue';
import Vuetify from 'vuetify/lib';

Vue.use(Vuetify);

export default new Vuetify({
  icons: {
    iconfont: 'mdi',
  },
  theme: {
    themes: {
      light: {
                primary: '#3742CC',
                secondary: '#FFCBB5',
                accent: '#B86440',
                error: '#f44336',
                warning: '#ffeb3b',
                info: '#607d8b',
                success: '#DEFFCF'
                },

                //Farbcodes:
                //#B86440
                //#DEFFCF
                //#FFCBB5
                //#3742CC
                //#8A8DB5
    },
  },
});
