<template>
  <div id="nav">
    <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
      <el-menu-item index="1" style="padding-right: 100px">首页</el-menu-item>
      <el-submenu index="2">
        <template #title>个人中心</template>
        <el-menu-item index="2-1">请假申请</el-menu-item>
        <el-menu-item index="2-2">请假情况</el-menu-item>
        <el-menu-item index="2-3">退出登录</el-menu-item>

      </el-submenu>
    </el-menu>
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
<script>

export default {
  data() {
    return {
      activeIndex: '1',
      activeIndex2: '1',
      token:"",
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
      if(key === "1"){
        console.log("首页点击");
      }else{
        if(keyPath[1] === "2-1"){
          console.log("假条申请");
        }else if(keyPath[1] === "2-2"){
          console.log("请假情况");
        }else{
          console.log("退出登录");
        }
      }

      // if(key === 2){
      //   if(key === 1){
      //     console.log("2-1");
      //   }
      // }

    }
  }

}
</script>
