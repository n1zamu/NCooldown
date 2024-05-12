# NCooldowns

## Table of Contents 📃

- [Description](#description)
- [Screenshots](#screenshots)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contacts](#contacts)

## Description 💙
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

## Written on 👩‍💻
![Java](https://img.shields.io/badge/-Java-FFA500?style=for-the-badge&logo=java&logoColor=0000CD)
![Bukkit](https://img.shields.io/badge/-Bukkit-7B68EE?style=for-the-badge)

## Screenshots 📸
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example1.png)
![Example](https://github.com/n1zamu/NCooldown/blob/main/screenshots/example2.png)

### Installation 🌙
Latest version - https://github.com/n1zamu/NCooldown/releases/

Download the latest version and place it in the PLUGINS DIR on your server.
It will create a nCooldowns folder in the plugins folder, where there will be a database.db file containing player databases and a config.yml file for flexible plugin customization.

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

Последняя версия - https://github.com/n1zamu/NCooldown/releases/

Скачайте последнюю версию и поместите ее в PLUGINS DIR на вашем сервере.
Он создаст папку nCooldowns в папке plugins, где будет находиться файл database.db, содержащий базы данных игроков, и файл config.yml для гибкой настройки плагина.

# nCooldowns Plugin Documentation

Welcome to the nCooldowns plugin! This powerful tool is designed to manage chat and command cooldowns on your Minecraft server to enhance moderation and user experience. Below you'll find a detailed guide to getting started with nCooldowns, including permissions, features, and configuration options.

## Features 🌟

- **Cooldown Management:** Enforce custom cooldown periods for chat and command usage to prevent spam and maintain server health.
- **Color Code Support:** Customize messages with Minecraft's color codes to make alerts and notifications stand out.
- **Sound Notifications:** Optional sound notifications to alert players when cooldowns expire or commands are available.
- **Multilanguage Support:** Messages can be configured in both English and Russian.

## Permissions 🔑

- `nCooldowns.bypass`: Allows bypassing chat cooldowns.
- `nCooldowns.reload`: Permits reloading the plugin's database.

## Placeholders

- `%time%`: Displays the remaining time before a player can use chat again.

## Configuration Options ⚙️

- **cooldown**: `600` - Sets the initial cooldown for new players (in seconds).
- **doubleDotCommands**: `true` - Disables commands containing colons, such as `minecraft:me`.
- **notification**: Activate to notify players about the remaining cooldown time.
- **sound**: `true` - Enable to use sound notifications.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Sets the type of sound for notifications.
- **message**: `true` - Send cooldown notifications as chat messages.
- **title**: `false` - Display notifications as full-screen messages.

## Messages 📝

- **noPermission**: "&fYou don't have permission to reload cooldowns"
- **unknownUsage**: "&fUse: /ncooldowns reload"
- **successfullyReload**: "&nCooldowns successfully reloaded!"
- **joinMessage**: "&fYou are new to the server! Play &6%time% to write in chat!"
- **blockMessage**: "&fYou haven't played the time yet! Wait &6%time%!"
- **notEnoughArgumentsMessage**: "&fNot enough arguments!"
- **doubleDotMessage**: "&fColon commands are forbidden!"

![Line](https://github.com/n1zamu/n1zamu/blob/main/assets/sepparator.png)

## Возможности 🌟

- **Управление Кулдаунами**: Применение индивидуальных периодов ожидания для чата и использования команд для предотвращения спама и поддержания здоровья сервера.
- **Поддержка Цветовых Кодов**: Настройка сообщений с использованием цветовых кодов Minecraft для выделения уведомлений и оповещений.
- **Звуковые Уведомления**: Опциональные звуковые уведомления для оповещения игроков о окончании кулдаунов или доступности команд.
- **Мультиязычная Поддержка**: Сообщения могут быть настроены на английском и русском языках.

## Разрешения 🔑

- `nCooldowns.bypass`: Позволяет обходить кулдауны чата.
- `nCooldowns.reload`: Разрешает перезагрузку базы данных плагина.

## Плейсхолдеры

- `%time%`: Отображает оставшееся время до того, как игрок сможет снова использовать чат.

## Опции Конфигурации ⚙️

- **cooldown**: `600` - Устанавливает начальный кулдаун для новых игроков (в секундах).
- **doubleDotCommands**: `true` - Отключает команды, содержащие двоеточия, например, `minecraft:me`.
- **notification**: Активировать для уведомления игроков о оставшемся времени кулдауна.
- **sound**: `true` - Включить звуковые уведомления.
- **soundType**: `"ENTITY_EXPERIENCE_ORB_PICKUP"` - Устанавливает тип звука для уведомлений.
- **message**: `true` - Отправлять уведомления о кулдаунах в виде сообщений в чат.
- **title**: `false` - Отображать уведомления в виде сообщений на весь экран.

## Сообщения 📝

- **noPermission**: "&fУ вас нет прав для перезагрузки кулдаунов"
- **unknownUsage**: "&fИспользование: /ncooldowns reload"
- **successfullyReload**: "&cКулдауны успешно перезагружены!"
- **joinMessage**: "&fТы новичок на сервере! Отыграй &6%time% чтобы писать в чат!"
- **blockMessage**: "&fТы еще не отыграл время! Подожди &6%time%!"
- **notEnoughArgumentsMessage**: "&fНедостаточно аргументов!"
- **doubleDotMessage**: "&fКоманды через двоеточие запрещены!"

## Contacts 🔊

### My Discord Tag: n1zamu
![Discord](https://img.shields.io/badge/-Discord-4169E1?style=for-the-badge&logo=discord&logoColor=FFFFFF)


# ⭐Leave star on this project if you like this!
