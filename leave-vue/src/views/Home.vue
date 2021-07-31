
<template>
<!--  <el-input v-model="username" placeholder="请输用户名" size="280px"></el-input>-->
<!--  <h1></h1>-->
<!--  <el-input placeholder="请输入密码" v-model="password" show-password></el-input>-->
<!--  <el-button @click="login ">登录</el-button>-->

    <el-form :model="loginForm"  size="mini" v-show="!isLogin">

      <el-input v-model="loginForm.username" placeholder="用户名" prefix-icon="iconfont icon-user"></el-input>

      <el-input v-model="loginForm.password" placeholder="密码" prefix-icon="iconfont icon-3702mima"></el-input>

    <!--    <el-input v-model="loginForm.code" class="code" placeholder="验证码"></el-input>-->

      <el-button @click="login">登录</el-button>
    </el-form>


  <div v-show="isLogin">
    <h1>查询界面</h1>
    <el-table
        :data="tableData"
        border
        style="width: 100%">

      <el-table-column
          prop="nickname"
          label="姓名"
          width="80">
      </el-table-column>

      <el-table-column
          prop="reason"
          label="请假原因"
          width="120">
      </el-table-column>

      <el-table-column
          prop="start_time"
          label="开始时间"
          width="120">
      </el-table-column>

      <el-table-column
          prop="end_time"
          label="结束时间"
          width="120">
      </el-table-column>

      <el-table-column
          fixed="right"
          label="查看"
          width="100">
        <template #default="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>

        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
  import { defineComponent, ref } from 'vue'
  import requests from "../utils/request";

export default defineComponent ({
  data(){
    return{
      isLogin: false,
      tableData:[],
      token: '',
      loginForm: {
        username: '',
        password: '',
      },

    }
  },

  methods: {
    handleClick(row) {
      let one;
      let two;
      let three;
      console.log(row);
      if (row.leader_one == 1){
        one = "同意";
      }else {
        one = "暂无消息";
      }
      if (row.leader_two == 1){
        two = "同意";
      }else {
        two = "暂无消息";
      }
      if (row.leader_three == 1){
        three = "同意";
      }else {
        three = "暂无消息";
      }
      alert("一级领导审批情况：" +one +"\n二级领导审批情况：" + two + "\n三级领导审批情况：" + three);

    },
    login(){
      console.log(this.loginForm.username);
      console.log(this.loginForm.username);
      const that = this;
      requests.post("/api/login", this.loginForm).then(res => {
        console.log(res);
        if(res.code === 200){
          alert("登录成功！");
          that.token = res.data.token;
          console.log(res.data.token);
          that.isLogin = true;

        }else{
          alert(res.message);
        }
        requests.post("/api/lookup", this.loginForm).then(res => {
          that.tableData = res.data;
        })


      })

    }

  }
})
</script>

<style>

</style>
