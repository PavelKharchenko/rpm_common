
node(){
 stage("Hello world"){
   def res = scm.credentials[0].id
    echo res 
   cleanWs()
}
}
