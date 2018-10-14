#!/bin/bash

echo enjoyDH007 | sudo -S docker build . -t $DOCKER_DOMAIN/$APP_NAME:latest
