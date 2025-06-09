<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='keshiyuan'"  label="科室员工号" prop="keshiyuangonghao">
          <el-input v-model="ruleForm.keshiyuangonghao" readonly              placeholder="科室员工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='keshiyuan'"  label="科室员姓名" prop="keshiyuanxingming">
          <el-input v-model="ruleForm.keshiyuanxingming"               placeholder="科室员姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='keshiyuan'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="keshiyuantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='keshiyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in keshiyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='keshiyuan'"  label="科室" prop="keshi">
          <el-input v-model="ruleForm.keshi"               placeholder="科室" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='keshiyuan'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='keshiyuan'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                                                <el-col :span="12">
        <el-form-item   v-if="flag=='weixiuyuan'"  label="维修员工号" prop="weixiuyuangonghao">
          <el-input v-model="ruleForm.weixiuyuangonghao" readonly              placeholder="维修员工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='weixiuyuan'"  label="维修员姓名" prop="weixiuyuanxingming">
          <el-input v-model="ruleForm.weixiuyuanxingming"               placeholder="维修员姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='weixiuyuan'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="weixiuyuantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='weixiuyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in weixiuyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='weixiuyuan'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='weixiuyuan'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                                                                                                                  <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                              keshiyuanxingbieOptions: [],
                                                                                                                                    weixiuyuanxingbieOptions: [],
                                                                                                                                                                                                                                        };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                    this.keshiyuanxingbieOptions = "男,女".split(',')
                                                                                        this.weixiuyuanxingbieOptions = "男,女".split(',')
                                                                                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                keshiyuantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
                                                                                        weixiuyuantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
                                                                                                                                                                    onUpdateHandler() {
                              if((!this.ruleForm.keshiyuangonghao)&& 'keshiyuan'==this.flag){
        this.$message.error('科室员工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'keshiyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.keshiyuanxingming)&& 'keshiyuan'==this.flag){
        this.$message.error('科室员姓名不能为空');
        return
      }
                                                                                                                                                                                                                                                            if( 'keshiyuan' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                        if( 'keshiyuan' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                            if((!this.ruleForm.weixiuyuangonghao)&& 'weixiuyuan'==this.flag){
        this.$message.error('维修员工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'weixiuyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.weixiuyuanxingming)&& 'weixiuyuan'==this.flag){
        this.$message.error('维修员姓名不能为空');
        return
      }
                                                                                                                                                                                                      if( 'weixiuyuan' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                        if( 'weixiuyuan' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                              this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
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
</style>
