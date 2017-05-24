echo off
title VKStatistcs
cls

java -jar ^
 -server ^
 -Xmx2G ^
 -Xms1G ^
 -XX:+AggressiveOpts ^
  javastatistics-1.0-SNAPSHOT-jar-with-dependencies.jar
pause