git上传不了，解决步骤：

1.  git config --global http.sslVerify "false"
2. git config --global http.proxy http://127.0.0.1:1080
3. git config --global --unset http.proxy
4. 然后用git add .
5. git commit -m "2021.11.5"
6. git push origin master