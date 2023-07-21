
node(){
 stage("Hello world"){
   def res = scm.userRemoteConfigs.credentials[0].id
    echo res 
   cleanWs()
}
}
