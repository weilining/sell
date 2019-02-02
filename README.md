

# macOS idea 调节字体大小
快捷键 command + ，
![image-20190202204227125](images/image-20190202204227125.png)

![30E0F4AD-BA86-494D-946E-39EF00A00A17](images/image-201902022042271251.png)

# 4-1用jpa来操纵数据库
# github创建空分支
```git
git checkout --orphan doc
#该命令会创建一个名为doc的分支，并且该分支下有前一个分支下的所有文件。
#删除命令
#我们不想提交任何内容，所以我们需要把当前内容全部删除，用git命令：
git rm -rf .
#提交分支
#使用commit命令来提交分支
git add *
git commit -am "init"
#如果没有任何文件提交的话，分支是看不到的，可以创建一个新文件后再次提交则#新创建的branch就会显示出来。
#使用branch来查看分支是否创建成功
git branch -a
#同步到github
git push --set-upstream origin doc

#合并分支
git checkout master
git merge doc
```
# github创建新分支并继承当前分支
```
git checkout -b newbranch

```
# 数据库对象（表的映射）