git上传不了，解决步骤：

1.  git config --global http.sslVerify "false"
2. git config --global http.proxy http://127.0.0.1:1080
3. git config --global --unset http.proxy//取消全局代理
4.  git config --global --unset https.proxy
5.  然后用git add .
6.  git commit -m "2021.11.5"
7.  git push origin master