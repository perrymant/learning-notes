# Git Version Control
Version Control is useful because:
- it's a system that records changes to a file or set of files over time so that you can recall specific versions later.
- important for documents that undergo a lot of revision and redrafting and is particularly important for code files because they can easily be changed by a number of different users.
- good for collaboration
- good for backup

## Common Git Commands
| Command                                    | What it does                                     |
|--------------------------------------------|--------------------------------------------------|
| `git clone <site info>`                    | Clone a remote repo to local                     |
| `git pull`                                 | Fetch from remote repo to local branch           |
| `git status`                               | Show the working tree status                     |
| `git add .`                                | Add all files that have changes to staging       |
| `git commit -m "your message goes here"`   | Make a commit and add message                    |
| `git push`                                 | Send local commit to remote                      |
| `git checkout master`                      | Look at your master branch                       |
| `git checkout <branch-name>`               | Look at a branch                                 |
| `git diff --cached`                        | See what's in the cached area (prior to staging) |
| `git reset --hard`                         | delete all branch progress                       |


### Merge issues
Look like this:
```GIT
<<<<<<<HEAD
current branch
===
Other code
>>>>>>>
```
Typically use a hybrid of both current and other when merging - but you must check carefully!


```GIT
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

    modified:   .gitignore
    modified:   README.md
    modified:   src/main/java/io/github/perrymant/moneymaker/FileIO.java
    modified:   src/test/java/io/github/perrymant/moneymaker/FileIOTest.java
    deleted:    src/test/resources/dump/file_with_data
    deleted:    src/test/resources/dump/file_with_data_write_test

no changes added to commit (use "git add" and/or "git commit -a")
 TCWP  ~/Documents/Java/moneymaker   add-fileIO ●  git add .
 TCWP  ~/Documents/Java/moneymaker   add-fileIO ✚  git stash
Saved working directory and index state WIP on add-fileIO: d9e4e63 build failed, changed gitignore file
 TCWP  ~/Documents/Java/moneymaker   add-fileIO  git stash list
 TCWP  ~/Documents/Java/moneymaker   add-fileIO  git pull
remote: Counting objects: 12, done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 12 (delta 3), reused 11 (delta 3), pack-reused 0
Unpacking objects: 100% (12/12), done.
From https://github.com/perrymant/moneymaker
   fca0015..56a70b6  master     -> origin/master
Already up to date.
 TCWP  ~/Documents/Java/moneymaker   add-fileIO  git merge origin/master
Auto-merging README.md
CONFLICT (add/add): Merge conflict in README.md
Automatic merge failed; fix conflicts and then commit the result.
 ✘ TCWP  ~/Documents/Java/moneymaker   add-fileIO ●✚ >M< 

 ### Take it sloooooow!!! ###

  ✘ TCWP  ~/Documents/Java/moneymaker   add-fileIO ●✚ >M<  gs
On branch add-fileIO
Your branch is up to date with 'origin/add-fileIO'.

You have unmerged paths.
  (fix conflicts and run "git commit")
  (use "git merge --abort" to abort the merge)

Unmerged paths:
  (use "git add <file>..." to mark resolution)

    both added:      README.md

no changes added to commit (use "git add" and/or "git commit -a")
 TCWP  ~/Documents/Java/moneymaker   add-fileIO ●✚ >M<  git diff

 updated merge conflicts in README.md
```
```
 add before stash
 git stash pop
```

## Git branching
```
           /----------------*SubbranchB~~~~~~~~~~~~~~~~~~~~~~~~~\ Merge to master
          /------------*BranchA(PR)~~~~~~~*\Merge to master      \
···*-----*Master~~~~~~~~~~~~~~~~~~~~~~~~~~~~*~~~~~~~~~~~~~~~~~~~~~*~~~~~~>

                                  Time -->
```

```
            /-------*FeatureC~~~~~ PR ~~~~~~~~~~~~~~~~~~~~~~~~\ Merge
           /--------*FeatureB~~~~~ PR ~~~~~~~~~~~~~~\ Merge    \
          /---------*FeatureA~~~~~ PR ~~*\ Merge     \          \
···*-----*Master~~~~~~~~~~~~~~~~~~~~~~~~~~*~~~~~~~~~~~*~~~~~~~~~~*~~~~>

                                  Time -->
```
git push origin HEAD:FrogSprintImproveDocumentationPersistentData


Scenario: I created a feature branch, and then updated Master. I wanted the new stuff from master -> feature branch:
```

          /------------*Feature-BranchA~~~~~~~~~~~~~~~~~~~~*~~~~~~~~~~>
···*-----*Master~~~~~~~~~~~~~~~~~~~~~~~~~~~~UpdatedMaster*/

                                  Time -->
git checkout master
git pull
git checkout feature-branch
git merge master
```

### Rename git repo (issue with renaming directory to lowercase)
Basic rename (or move):
`git mv <old name> <new name>`
Case sensitive rename—eg. from casesensitive to CaseSensitive — you must use a two step:
`git mv casesensitive tmp`
`git mv tmp CaseSensitive`

### Steps to include a Github Status badge:
1. activate the repo via travis profile @ https://travis-ci.org/
1. create .Travis.yml file in project and added:
    ```
    language: java
    jdk:
      - oraclejdk8
    ```
1. git add, commit & push.
1. check all is well in travis
1. Badge on travis page or also on https://shields.io/ for badge

GIT speedup: git add .;git commit -m "review comment: constructors in abstract classes";git push
