# NCooldowns

## Table of Contents

- [Description](#description)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contacts](#contacts)

## Description
NCooldown - Плагин для серверов Minecraft версии 1.16.5. Помогает ограничить доступ к чату новичкам.
Это делает спам на вашем сервере более сложным для недоброжелателей. 
Также этот плагин не позволяет отправлять новым игрокам сообщения через двоеточие, по типу minecraft:me.
NCooldowns имеет очень гибкую настройку, которая включает в себя тип уведомления, тип звука уведомления, различные сообщения для недействительных действий, время отключения чата для новичков.
Сообщения в плагине имеют поддержку цветовых кодов через &.
У плагина есть плэйсхолдер %time%, отображающий оставшееся время!

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

NCooldown - Plugin for Minecraft servers version 1.16.5. Helps to restrict access to chat to newbies.
This makes spamming on your server more difficult for detractors. 
Also, this plugin prevents you from sending new players messages via colon.
NCooldowns has very flexible customization which includes notification type, notification sound type, different messages for invalid actions, time to disable chat to newbies.
Messages in the plugin have support for color codes via &.
The plugin has a %time% placeholder that displays the time remaining!

## Written on
![Java](https://img.shields.io/badge/-Java-FFA500?style=for-the-badge&logo=java&logoColor=0000CD)
![Bukkit](https://img.shields.io/badge/-Bukkit-7B68EE?style=for-the-badge)

## Screenshots
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example1.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example2.png)

### Installation
Latest version - https://github.com/n1zamu/NCooldown/releases/

Download the latest version and place it in the PLUGINS DIR on your server.
It will create a nCooldowns folder in the plugins folder, where there will be a database.db file containing player databases and a config.yml file for flexible plugin customization.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

Последняя версия - https://github.com/n1zamu/NCooldown/releases/

Скачайте последнюю версию и поместите ее в PLUGINS DIR на вашем сервере.
Он создаст папку nCooldowns в папке plugins, где будет находиться файл database.db, содержащий базы данных игроков, и файл config.yml для гибкой настройки плагина.

## Usage

### English Description:

PlaceHolder - %time% - time left to use chat!
There is support for color codes!

  noPermission: "&fYou don't have permission to reload cooldowns" - Text when you don't have permission to use commands.
  
  unknownUsage: "&fUse: /ncooldowns reload" - Text when reloading the database for administration.
  
  successfullyReload: "&ncooldowns successfully reloaded!" - Text when reloading the database for the administration
  
  joinMessage: "&fYou are new to the server! Play &6%time% to write in chat!" - Text for newcomer on the server
  
  blockMessage: "&fYou haven't played the time yet! Wait &6%time%!" - Text when trying to send a message from a player who hasn't played back the time.
  
  notEnoughArgumentsMessage: "&fNot enough arguments!" - Text when there are not enough items to send a command
  
  doubleDotMessage: "&fColon commands are forbidden!" - Text when sending a colon command

cooldown: 600 - Delay for newcomers on the server!

doubleDotCommands: true - Disable commands with a colon, like minecraft:me.

notification: - Notifies the player of the elapsed time.

sound: true - Sound when notifying the player

soundType: "ENTITY_EXPERIENCE_ORB_PICKUP" - Type of sound when notifying the player

message: true - As a message to the chat room

title: false - As a full screen message

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

### Russian Description:

ПлэйсХолдер - %time% - время оставшееся для использования чата!
Есть поддержка цветовых кодов!

  noPermission: "&fУ вас нет прав для перезагрузки кулдаунов" - Текст при отсутствие прав на использование команд
  
  unknownUsage: "&fИспользование: /ncooldowns reload" - Текст при перезагрузке базы данных для администрации
  
  successfullyReload: "&cКулдауны успешно перезагружены!" - Текст при перезагрузке базы данных для администрации
  
  joinMessage: "&fТы новичок на сервере! Отыграй &6%time% чтобы писать в чат!" - Текст для новичка на сервере
  
  blockMessage: "&fТы еще не отыграл время! Подожди &6%time%!" - Текст при попытке отправить сообщение от игрока, который не отыграл время.
  
  notEnoughArgumentsMessage: "&fНедостаточно аргументов!" - Текст при недостатке элементов для отправки команды
  
  doubleDotMessage: "&fКоманды через двоеточие запрещены!" - Текст при отправке команды через двоеточие

cooldown: 600 - Задержка для новичков на сервере!

doubleDotCommands: true - Отключение команд через двоеточие, по типу minecraft:me

notification: - Оповещение игрока о прошедшем времени

  sound: true - Звук при оповещении игрока
  
  soundType: "ENTITY_EXPERIENCE_ORB_PICKUP" - Тип звука при оповещении

  message: true - В виде сообщения в чат
  
  title: false - В виде сообщения на весь экран

## Contacts

### My Discord Tag: n1zamu
![Discord](https://img.shields.io/badge/-Discord-4169E1?style=for-the-badge&logo=discord&logoColor=FFFFFF)


# ⭐Leave star on this project if you like this!
