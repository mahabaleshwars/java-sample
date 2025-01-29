#!/bin/bash

# Set the JAVA_VERSION variable
JAVA_VERSION='17'

# Export the JAVA_VERSION as an environment variable for use in GitHub Actions
echo "JAVA_VERSION=$JAVA_VERSION" >> $GITHUB_ENV
