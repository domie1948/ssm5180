<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(208, 163, 140, 0.53);borderRadius:10px">
        <h1 class="h1" style="color:rgba(255, 255, 255, 1);fontSize:28px;">医院设备管理系统注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">科室员工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.keshiyuangonghao" class="input" type="text" placeholder="科室员工号">
			   </div>
			 </div> -->
			<el-form-item label="科室员工号" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.keshiyuangonghao" autocomplete="off" placeholder="科室员工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">科室员姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.keshiyuanxingming" class="input" type="text" placeholder="科室员姓名">
			   </div>
			 </div> -->
			<el-form-item label="科室员姓名" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.keshiyuanxingming" autocomplete="off" placeholder="科室员姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">科室</div>
			   <div class="input-container">
			     <input v-model="ruleForm.keshi" class="input" type="text" placeholder="科室">
			   </div>
			 </div> -->
			<el-form-item label="科室" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.keshi" autocomplete="off" placeholder="科室" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">手机号码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shoujihaoma" class="input" type="text" placeholder="手机号码">
			   </div>
			 </div> -->
			<el-form-item label="手机号码" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.shoujihaoma" autocomplete="off" placeholder="手机号码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='keshiyuan'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='keshiyuan'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																								<!-- <div v-if="tableName=='weixiuyuan'" class="input-group">
			   <div class="label">维修员工号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.weixiuyuangonghao" class="input" type="text" placeholder="维修员工号">
			   </div>
			 </div> -->
			<el-form-item label="维修员工号" class="input" v-if="tableName=='weixiuyuan'">
			  <el-input v-model="ruleForm.weixiuyuangonghao" autocomplete="off" placeholder="维修员工号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='weixiuyuan'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='weixiuyuan'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='weixiuyuan'" class="input-group">
			   <div class="label">维修员姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.weixiuyuanxingming" class="input" type="text" placeholder="维修员姓名">
			   </div>
			 </div> -->
			<el-form-item label="维修员姓名" class="input" v-if="tableName=='weixiuyuan'">
			  <el-input v-model="ruleForm.weixiuyuanxingming" autocomplete="off" placeholder="维修员姓名" type="text" />
			</el-form-item>
																														<!-- <div v-if="tableName=='weixiuyuan'" class="input-group">
			   <div class="label">手机号码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shoujihaoma" class="input" type="text" placeholder="手机号码">
			   </div>
			 </div> -->
			<el-form-item label="手机号码" class="input" v-if="tableName=='weixiuyuan'">
			  <el-input v-model="ruleForm.shoujihaoma" autocomplete="off" placeholder="手机号码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='weixiuyuan'" class="input-group">
			   <div class="label">邮箱</div>
			   <div class="input-container">
			     <input v-model="ruleForm.youxiang" class="input" type="text" placeholder="邮箱">
			   </div>
			 </div> -->
			<el-form-item label="邮箱" class="input" v-if="tableName=='weixiuyuan'">
			  <el-input v-model="ruleForm.youxiang" autocomplete="off" placeholder="邮箱" type="text" />
			</el-form-item>
																																																																																																									<el-button class="btn" type="primary" @click="login()">注册</el-button>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 注册
    login() {
                              if((!this.ruleForm.keshiyuangonghao) && `keshiyuan` == this.tableName){
        this.$message.error(`科室员工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `keshiyuan` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.keshiyuanxingming) && `keshiyuan` == this.tableName){
        this.$message.error(`科室员姓名不能为空`);
        return
      }
                                                                                                                                                                                                                                                            if(`keshiyuan` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                        if(`keshiyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                            if((!this.ruleForm.weixiuyuangonghao) && `weixiuyuan` == this.tableName){
        this.$message.error(`维修员工号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `weixiuyuan` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                  if((!this.ruleForm.weixiuyuanxingming) && `weixiuyuan` == this.tableName){
        this.$message.error(`维修员姓名不能为空`);
        return
      }
                                                                                                                                                                                                      if(`weixiuyuan` == this.tableName && this.ruleForm.shoujihaoma&&(!this.$validate.isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                        if(`weixiuyuan` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮件格式`);
        return
      }
                                                                                                                                                                                                                              this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20210131/1f64cb6cee3341f6b0cb688c4965485a.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(254, 254, 254, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 0px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					width: 100px;
					height: 44px;
					color: #fff;
					font-size: 14px;
					border-width: 0px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(249, 104, 104, 0.9);
				}
			}
		}
	}
</style>
