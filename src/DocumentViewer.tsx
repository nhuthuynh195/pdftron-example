import React, { useEffect } from "react";
import { Platform, SafeAreaView, StatusBar, View } from "react-native";
import { DocumentView } from "../submodules/pdftron-react-native";
import { DocumentViewerProps } from "../App";

const DocumentViewer = ({ route, navigation }: DocumentViewerProps) => {
  useEffect(() => {}, []);
  const { document } = route.params;
  return (
    <DocumentView
      collabEnabled={true}
      document={document}
      showLeadingNavButton={true}
      leadingNavButtonIcon={
        Platform.OS === "ios"
          ? "ic_close_black_24px.png"
          : "ic_arrow_back_white_24dp"
      }
      onLeadingNavButtonPressed={() => navigation.goBack()}
    />
  );
};

export default DocumentViewer;
