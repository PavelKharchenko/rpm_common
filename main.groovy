def res 
node(){
 stage("Hello world"){
    res = scm.userRemoteConfigs[0].credentialsId
    echo "id scm cred =" + res.trim()
   
  
   cleanWs()
}
 stage("WHEN"){
  when{
    expression { res ==~ /test/ }
 }
}
