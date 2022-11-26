def download(repo)
{
  git "${repo}"
}
def build()
{
  sh 'mvn package'
}
def deploy(a,b)
{
  sh "scp /var/lib/jenkins/workspace/${a}/webapp/target/webapp.war ubuntu@172.31.27.110:/var/lib/tomcat9/webapps/${b}.war"
}
def run(c)
{
  sh "sh java -jar /home/ubuntu/.jenkins/workspace/${c}/testing.jar"
}
