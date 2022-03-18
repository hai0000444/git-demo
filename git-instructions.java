在工作区中操作:
	要求: 先对工作名和邮箱进行配置,该操作只需操作一次，永久保存，如下
				git config user.email "348689061@qq.com"  设置邮箱
				git config user.name "one_uncle" 设置姓名

	git init   //在当前目录下右键打开 git-Bash-here, 输入 git init 产生一个git库
	git status //查看当前目录中的文件, 红色表示 还未加入暂存区
	git add 文件名(包括扩展名)   //将文件加入待提交列表(暂存区),文件变为绿色,准备被提交
	git rm --cached 文件名(包括扩展名)  //删除暂存区的文件
	git commit -m "first commit" [文件名]   将暂存区文件(默认全部文件) 提交到 版本库,并自定义注释. 
				

	git reflog  //显示精简的提交历史记录
	git log  //显示详细的提交历史记录

	git reset --hard <版本号>//将工作区向版本库进行对齐,工作区没有的文件会从版本库中复制一份

	git restore --staged <file> //将暂存区的文件从暂存区撤出，但不会更改文件
	git restore <file>  //将在工作空间,但是不在暂存区 的文件撤销更改

	git branch <分支名>    //创建分支
	git branch -v  //查看分支
	git checkout <分支名>   //切换分支
	git merge <分支名>    //把指定的分支合并到当前分支上

.git 隐藏文件夹是git初始化本地库的目录