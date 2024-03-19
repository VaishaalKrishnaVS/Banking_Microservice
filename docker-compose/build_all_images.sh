#!/bin/bash

# Define the command to execute
COMMAND="mvn compile jib:dockerBuild"

# Define the five folders
FOLDERS=(
    "../accounts"
    "../cards"
    "../configserver"
    "../eurekaserver"
    "../gateway"
    "../loans"
)

# Iterate through the folders and execute the command
for FOLDER in "${FOLDERS[@]}"; do
    echo "Executing command in folder: $FOLDER"
    cd "$FOLDER" || { echo "Failed to change directory to $FOLDER"; exit 1; }
    $COMMAND || { echo "Failed to execute command in $FOLDER"; exit 1; }
done

echo "Script execution completed."
