
node(){
 stage("Hello world"){
   def res = scm.userRemoteConfigs[0].credentialsId
    echo "id scm cred =" + res 
   cleanWs()
}
}
