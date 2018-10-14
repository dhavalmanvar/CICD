#!/bin/bash

./set_env.sh

BUILD_VERSION=`cat build_version.txt`
NEXT_BUILD_VERSION=`expr $BUILD_VERSION + 1`

echo $NEXT_BUILD_VERSION > build_version.txt
