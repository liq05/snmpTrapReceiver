@echo off
title "cn.bg.trapReceiver"
echo "port is receive port"
echo "community is snmp v1&v2 community"
echo "userName is snmp v3 username"
echo "authPassword,authProtocol snmp v3认证密码、协议"
echo "priPassword,priProtocol snmp v3加密密码、协议"
@echo on
java -jar -Dport=162 -Dcommunity=public -DsecurityName=securityName -DauthPassword=authPassword -DauthProtocol=MD5 -DpriPassword=priPassword -DpriProtocol=DES cn.bg.trap-1.0.jar