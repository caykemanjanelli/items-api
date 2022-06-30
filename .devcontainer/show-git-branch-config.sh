echo "configuring terminal to show current git branch.."

echo "
parse_git_branch() {
     git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/ (\1)/'
}  
       
export PS1=\"\u@\h \[\033[32m\]\w\[\033[33m\]\$(parse_git_branch)\[\033[00m\] $ \"

" >> /home/$USERNAME/.bashrc

source /home/$USERNAME/.bashrc 

echo "show git branch success!"


