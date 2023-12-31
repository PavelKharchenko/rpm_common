
library identifier: 'custom-lib@main', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'git@github.com:PavelKharchenko/rpm_common.git',
   credentialsId: 'test'])

def res 
node(){
 stage("Hello world"){
    res = scm.userRemoteConfigs[0].credentialsId
    echo "id scm cred =" + res.trim()
    def scenarios = PLAYBOOKS.toLowerCase().split(",")
    scenarios.each{scenario ->
      "$scenario"(this)
    }
   cleanWs()
 }
}
