init
# github创建空分支并初始化
```git
git checkout --orphan doc
git rm -rf .
git add *
git commit -am "init"
git branch -a
git push --set-upstream origin doc
```
# github创建继承当前分支的分支
```git
git checkout -b branchname

```
# 说明
如果修改的文件需要全部提交，我一般都是 git commit -am "commit messages" 如果修改的文件只提交一部分，用 git add -p git commit -m "commit messages"

