
node(){
 stage("Hello world"){
   def res = scm.userRemoteConfigs[0].credentialsId
    echo res 
   cleanWs()
}
}
