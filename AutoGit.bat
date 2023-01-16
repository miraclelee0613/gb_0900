set /a now=%date:~2%%time:6~%

git add .
git commit -m "auto push %now%"
git push origin master