echo off
title VKStatistcs
cls

:start

java -jar ^
 -server ^
 -Xmx4G ^
 -Xms1G ^
 -XX:+AggressiveOpts ^
 -XX:-UseGCOverheadLimit ^
 -XX:+DoEscapeAnalysis ^
 -XX:+HeapDumpOnOutOfMemoryError ^
 -XX:+UnlockDiagnosticVMOptions ^
 -XX:+DebugNonSafepoints ^
  TestServer-1.0-SNAPSHOT-jar-with-dependencies.jar
pause