
node(){
 stage("Hello world"){
   def res = checkout 
   echo res 
   cleanWs()
}
}
