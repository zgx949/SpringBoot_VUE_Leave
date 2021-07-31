// import { createApp } from 'vue'
//
// import router from './router'
// import store from './store'
// // import 'element-plus/lib/theme-chalk/index.css';
// import App from './App.vue';
//
//
// createApp(App).use(store).use(router).mount('#app')
import { createApp } from 'vue'
import ElementPlus from 'element-plus';
import 'element-plus/lib/theme-chalk/index.css';
import App from './App.vue';
import "./assets/globle.css"
import router from './router'
import store from './store'

createApp(App).use(store).use(router).use(ElementPlus).mount('#app')

// const app = createApp(App)
// app.use(ElementPlus)
// app.mount('#app')
