export JAVA_HOME=/usr/bin/java

for i in {1..3}
do
  sh ~/nacos"${i}"/bin/startup.sh
done

exec /usr/local/nginx/sbin/nginx -c /usr/local/nginx/nginx.conf