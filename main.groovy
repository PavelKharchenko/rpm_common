
node(){
 stage("Hello world"){
   def res = checkout scm
   echo res 
   cleanWs()
}
}
