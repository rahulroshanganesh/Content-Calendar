# Content Calendar




## Errors faced
After intiated the git in the working directory I have added and commited the files but couldnt push the content.
Create passprhase in github as shown below
![image](https://github.com/user-attachments/assets/02713361-229b-421d-be3e-b311c63e3497)
Settings -> Developer Setting -> Personal Access Tokens -> Fine-Grained Tokens [this is the password]

This didnt work so changed https git url to ssh in ".git/config" file or by the command

`
git remote set-url origin "https/ssh git url"
`

Then generated ssh keys in terminal using

`
ssh-keygen -t rsa -b 4096 -C "my email id"
`

It was store in this file "~/.ssh/id_rsa.pub". 
So when to settings -> SSH and GPG keys -> Created ssh key and pasted the public key.

To confirm the connections I used this commands

`
ssh -T git@github.com
`

Then I puhsed the code. It worked !!
