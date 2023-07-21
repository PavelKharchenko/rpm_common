
node(){
 stage("Hello world"){
   def res = scm.userRemoteConfigs
    echo res 
   cleanWs()
}
}
