#!/bin/bash

# 获取当前时间
current_time=$(date +%s)

# 获取一周前的日期
one_week_ago=$(date -d "-7 days" +%s)

# 查找 data 目录下的所有文件
files=$(find data -type f)

# 遍历所有文件
for file in $files; do
  # 获取文件的最后修改时间
  last_modified_time=$(stat -c %y "$file")

  # 如果文件的最后修改时间小于一周前
  if [ $last_modified_time -lt $one_week_ago ]; then
    # 删除文件
    rm "$file"
  fi
done