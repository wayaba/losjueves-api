# losjueves-api
Una api para la app de los jueves FC

Para compilar y dejar el jar listo para que el servicio lo tome

cd /home/ppedraza/git/losjueves-api/losjuevesapi/
mvn package
cd /opt/prod/
sudo cp /home/ppedraza/git/losjueves-api/losjuevesapi/target/losjuevesapi-0.0.1-SNAPSHOT.jar .




# Como dejar el jar corriendo como un servicio en linux

## Start by creating a system group for the user.
```
sudo groupadd -r appmgr
```

## Next, we create a system user jvmapps with the default group
```
sudo useradd -r -s /bin/false -g appmgr jvmapps
```

## Confirm user created and if with the correct group
```
# id jvmapps
uid=992(jvmapps) gid=986(appmgr) groups=986(appmgr)
```


## Create Systemd Service
```
sudo vim /etc/systemd/system/losjueves-api.service
```


## It will have content like below
```
[Unit]
Description=Los Jueves API Service

[Service]
WorkingDirectory=/opt/prod
ExecStart=/usr/bin/java -Xms128m -Xmx256m -jar losjuevesapi-0.0.1-SNAPSHOT.jar
User=jvmapps
Type=simple
Restart=on-failure
RestartSec=10

[Install]
WantedBy=multi-user.target
```


## Give the user and group ownership permissions for the Project Directory
```
sudo chown -R jvmapps:appmgr /opt/prod
```


## Reload systemd so that it knows of the new application added
```
sudo systemctl daemon-reload
```


## Once reloaded, start the service
```
sudo systemctl start losjueves-api.service
```


## Check status
```
sudo systemctl status losjueves-api
```
